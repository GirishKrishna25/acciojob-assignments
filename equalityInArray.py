numberOfElements = int(input())                     # 5
numbersArray = tuple(map(int, input().split()))     # 3 3 2 1 3

"""
numberOfElementsInArray = 5
numbersArray = (3, 3, 2, 1, 3)
print(numbersArray)
"""
# remove duplicates
numbersInArray = list(set(numbersArray))            # 1 2 3
# Sprint(numbersInArray)

# showdown
deletionsCount = []
for number in numbersInArray:
    deletionsCount.append(len(numbersArray) - numbersArray.count(number))
print(min(deletionsCount))