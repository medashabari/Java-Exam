d={"Their":"Their","Windows":"Window","Happy":"Hello","mum":"mumm"}
exact,alomost,complte=0,0,0
for key,value in d.items():
    diff = len(key)-len(value)
    if diff!=0:
        c=0
        if diff == 1 or -1:
            for i, j in zip(key, value):
                if i != j:
                    c += 1
            c+=1
            if c<2:
                alomost+=1
            elif c>=2:
                complte+=1
        else:
            complte+=1
    else:
        if key==value:
            exact+=1
        else:
            c=0
            for i,j in zip(key,value):
                if i!=j:
                    c+=1
            if c<2:
                alomost+=1
            elif c>=2:
                complte+=1

print(exact,alomost,complte)