# Created December 2018
import math as m

num = 600851475143

def prime(x):
    for p in prime_list:
        if p > m.sqrt(x):
            return 1

        if x % p == 0:
            return 0
    return 1

prime_list = [2]
factor = -1
n = 3

while n < m.sqrt(num):
    if prime(n):
        prime_list.append(n)

        if (num % n) == 0:
            factor = n
    n += 2

print(factor)
