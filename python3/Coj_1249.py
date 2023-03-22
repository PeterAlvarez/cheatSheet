abc = "¿aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ"

while True:
    try:
        out=''
        for i in list(input()):
            if(abc.count(i)):
                if (abc.index(i)+26<=52):
                    out += abc[abc.index(i)+26]
                else:
                    out += abc[(26-abc.index(i))*(-1)]
            else:
                out += i


        print(out)

    except EOFError:
        break


