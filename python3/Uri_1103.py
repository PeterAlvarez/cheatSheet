while True:
    try:
        hi, mi, hf, mf = map(int,input().strip().split(" "))
        if( hi == mi == hf == mf == 0): break
        hi = (hi*60) + mi
        hf = (hf*60) + mf
        if hi<hf :
            print(hf-hi)
        else :
            print((hf+1440)-hi)
    except EOFError:
        break