# Created December 2018
import math as m

def prime(num):
    i = 0
    for i in range(len(prime_list)):
        # only need to check primes less than or equal to sqrt(num)
        if prime_list[i] > m.sqrt(num):
            return 1
        # if num is divisible by anything inside the prime_list
        if num % prime_list[i] == 0:
            return 0
    return 1

prime_list = [2, 3]
num = 5
while num < 600851475143 + 1:
    if prime(num):
        prime_list.append(num)
    print(num)
    num += 2

k = len(prime_list) - 1
while k > 0:
    if 600851475143 % prime_list[k] == 0:
        print(prime_list[k])
        break
    k -= 1
