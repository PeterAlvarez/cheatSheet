for i in range(int(input())):
    a, b = input().split(" ")
    print('encaixa' if ( b == a[-len(b):]) else 'nao encaixa')