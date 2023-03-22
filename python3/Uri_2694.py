import re,functools

for x in range(int(input())):
    print(functools.reduce(lambda x,y : x+y, list(map(int,re.findall("\d+",input())))))
