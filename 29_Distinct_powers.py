# Created December 2017

l = []
for i in range(2, 101):
    a = i
    for b in range(2, 101):
        a *= i
        l.append(a)

l.sort()
i = 0
while i < len(l)-1:
    if l[i] == l[i+1]:
        del(l[i+1])
        i -= 1
    i += 1
print(len(l))
