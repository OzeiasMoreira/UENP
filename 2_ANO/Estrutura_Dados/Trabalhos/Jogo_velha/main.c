#include <stdio.h>
#define DIM 3

int vez;

int menu(void);

void clear(void);

void zeraTabuleiro(int tabuleiro[][DIM]);

void exibeTabuleiro(int tabuleiro[][DIM]);

void jogar(int tabuleiro[][DIM]);

int checaLocal(int tabuleiro[][DIM], int linha, int coluna);

int checaLinha(int tabuleiro[][DIM]);

int checaColuna(int tabuleiro[][DIM]);

int checaDiagonal(int tabuleiro[][DIM]);

int checaEmpate(int tabuleiro[][DIM]);

int checaTermino(int tabuleiro[][DIM], int vez);

void jogada(int tabuleiro[][DIM]);


int main(void)
{
    int tabuleiro[DIM][DIM],
        continuar;

    do
    {
        vez=1;
        continuar = menu();
        if(continuar == 1)
            jogar(tabuleiro);

    }while(continuar);

    return 0;
}

int menu(void)
{
    int opcao;

        printf("\t\tJogo da Velha\n");
        printf("\n1.Jogar\n");
        printf("0.Sair\n");
        printf("\nOpcao: ");

        scanf("%d", &opcao);

        switch(opcao)
        {
           case 1:
           case 0:
                break;
           default:
                clear();
                printf("Insira uma opcao valida\n");
        }

    return opcao;
}

void clear(void)
{
    int count=0;

    while(count != 100)
    {
        putchar('\n');
        count++;
    }
}

void zeraTabuleiro(int tabuleiro[][DIM])
{
    int linha, coluna;
    for(linha = 0 ; linha < DIM ; linha++)
        for(coluna = 0 ; coluna < DIM ; coluna++)
            tabuleiro[linha][coluna] = 0;
}

void exibeTabuleiro(int tabuleiro[][DIM])
{
    int linha, coluna;

    printf("   1   2   3");
    putchar('\n');

    for(linha = 0 ; linha < DIM ; linha++)
    {
        for(coluna = 0 ; coluna < DIM ; coluna++)
        {
            if(tabuleiro[linha][coluna] == 0)
                printf("    ");
            else
                if(tabuleiro[linha][coluna] == 1)
                    printf("  X ");
                else
                    printf("  O ");

            if(coluna != (DIM-1))
                printf("|");
        }
        putchar('\n');
    }
    putchar('\n');
}

void jogar(int tabuleiro[][DIM])
{
    int continua;
    zeraTabuleiro(tabuleiro);

    do
    {
        clear();
        exibeTabuleiro(tabuleiro);
        jogada(tabuleiro);

    }while(checaTermino(tabuleiro, vez) != 1);
}


int checaLocal(int tabuleiro[][DIM], int linha, int coluna)
{
    if(linha < 0 || linha > (DIM-1) || coluna < 0 || coluna > (DIM-1) || tabuleiro[linha][coluna] != 0)
        return 0;
    else
        return 1;
}

int checaLinha(int tabuleiro[][DIM])
{
    int linha, coluna,
        soma;

    for(linha = 0 ; linha < DIM ; linha++)
    {
        soma=0;

        for(coluna = 0 ; coluna < DIM ; coluna++)
            soma += tabuleiro[linha][coluna];

        if(soma==DIM || soma == (-1)*DIM)
            return 1;
    }

    return 0;
}

int checaColuna(int tabuleiro[][DIM])
{
    int linha, coluna,
        soma;


    for(coluna = 0 ; coluna < DIM ; coluna++)
    {
        soma=0;

        for(linha = 0 ; linha < DIM ; linha++)
            soma += tabuleiro[linha][coluna];

        if(soma==DIM || soma == (-1)*DIM)
            return 1;
    }

    return 0;
}

int checaDiagonal(int tabuleiro[][DIM])
{
    int linha,
        diagonal_principal=0,
        diagonal_secundaria=0;

    for(linha = 0 ; linha < DIM ; linha++)
    {
        diagonal_principal += tabuleiro[linha][linha];
        diagonal_secundaria += tabuleiro[linha][DIM-linha-1];
    }

    if(diagonal_principal==DIM || diagonal_principal==(-1)*DIM ||
       diagonal_secundaria==DIM || diagonal_secundaria==(-1)*DIM)
       return 1;

    return 0;
}

int checaEmpate(int tabuleiro[][DIM])
{
    int linha, coluna;

    for(linha = 0 ; linha < DIM ; linha++)
        for(coluna = 0 ; coluna < DIM ; coluna++)
            if(tabuleiro[linha][coluna] == 0)
                return 0;

    return 1;
}

int checaTermino(int tabuleiro[][DIM], int vez)
{
    if(checaLinha(tabuleiro))
    {
        printf("Jogo encerrado. Jogador %d venceu !\n\n", (vez%2)+1);
        exibeTabuleiro(tabuleiro);
        return 1;
    }

    if(checaColuna(tabuleiro))
    {
        printf("Jogo encerrado. Jogador %d venceu !\n\n", (vez%2)+1);
        exibeTabuleiro(tabuleiro);
        return 1;
    }

    if(checaDiagonal(tabuleiro))
    {
        printf("Jogo encerrado. Jogador %d venceu !\n\n", (vez%2)+1);
        exibeTabuleiro(tabuleiro);
        return 1;
    }

    if(checaEmpate(tabuleiro))
    {
        printf("Jogo encerrado. Ocorreu um empate! !\n\n");
        exibeTabuleiro(tabuleiro);
        return 1;
    }

    return 0;
}

void jogada(int tabuleiro[][DIM])
{
    int linha, coluna;
    vez++;
    printf("\n--> Jogador %d \n", (vez % 2) + 1);

    do
    {
        printf("Linha: ");
        scanf("%d", &linha);
        linha--;

        printf("Coluna: ");
        scanf("%d", &coluna);
        coluna--;

        if(checaLocal(tabuleiro, linha, coluna) == 0)
            printf("Insira uma posição que exista ou que nao esteja ocupada.\n");

    } while(checaLocal(tabuleiro, linha, coluna) == 0);

    if(vez % 2)
        tabuleiro[linha][coluna] = -1;
    else
        tabuleiro[linha][coluna] = 1;
}