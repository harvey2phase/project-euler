level = 1001

s1, s2 = 0, 0
n1, n2 = 1, 1
d1, d2 = 2, 4

for i in range(level - 1):
    n1 += d1
    n2 += d2

    print(n1, n2)

    s1 += n1
    s2 += n2

    d1 += 2
    if i != 0 and i % 2 == 1:
        d2 += 4


print(s1 + s2 + 1)
