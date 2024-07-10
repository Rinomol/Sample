#.....................function call..........................
"""def fun():
    print("Welcome python")
fun()"""


#..........................return statement.....................................
"""def add(num1, num2):
    num3 = num1 + num2
    print(num3)
add(10,20)"""

"""def add(num1, num2):
    num3 = num1 + num2
    return num3
print("Addition is : ",add(10,20))"""


"""def conv(x):
    if(x==1):
        return 'one'
    if(x==2):
        return 'two'
    if(x==3):
        return 'three'
    if(x==4):
        return 'four'
n=int(input('Enter a number between 1 and 4:'))
print(n,'in words:',conv(n))"""


#.............................default arguments..............................
"""def myFun(x, y=50):
    print("x: ", x)
    print("y: ", y)
myFun(10)"""


#.....................................keyword arguments....................................
"""def student(firstname, lastname):
    print(firstname, lastname)
student(firstname='Geeks', lastname='Practice')
student(lastname='Practice', firstname='Geeks')
student(lastname='Geeks', firstname='Practice')"""


#.............................positional argument....................................
"""def nameAge(name, age):
    print("Hi, I am", name)
    print("My age is ", age)
print("Case-1:")        # You will get correct output because  argument is given in order
nameAge("Suraj", 27)
print("\nCase-2:")      # You will get incorrect output because argument is not in order
nameAge(27, "Suraj")"""


#........................Arbitrary arguments..........................
#.....................(non-Keyword Arguments).............................
"""def myFun(*argv):
    for arg in argv:
        print(arg)
myFun('Hello', 'Welcome', 'to', 'GeeksforGeeks')"""

#...................(Keyword Arguments)....................
"""def myFun(**kwargs):
    for key, value in kwargs.items():
        print("%s == %s" % (key, value))
myFun(first='Geeks', mid='for', last='Geeks')"""


#.....................................variable..........................
"""a = 'apple'
b = 'orange'
c = 'banana'
print(a,b,c)"""


#..................................local variable.............................
"""def fun():
    s = "Welcome"
    print(s)
fun()"""


#...................................global variable..........................
"""def fun():
    print(s)
s = "I Love Python"
fun()"""


#...........................global keyword.............................
"""x = 15
def change():
    global x
    x = x + 5
    print("Inside  function :", x)
change()
print("Outside function :", x)"""


"""x = 0
def compute():
    global x
    x+=5
    print("The value is : ", x)
def display():
    global x
    x-=3
    print("Display : ", x)
#x = 0
compute()
display()
compute()"""


#.........................Lambda function......................
##double = lambda x: x * 2
##print(double(5))

##str1 = 'GeeksforGeeks'
##upper = lambda string: string.upper()
##print(upper(str1))
###print(str1.upper())

"""x=lambda a,b:a*b
print(x(5,6))"""


#........................Built-in functions...........................
#.........................filter() .using lambda............................................
"""my_list = [1, 5, 4, 6, 8, 11, 3, 12] 
new_list = list(filter(lambda x:(x%2 == 0),my_list))
print(new_list)"""

#....................................filter() using def..............................
##def evenval(x):
##    my_list = [1, 5, 4, 6, 8, 11, 3, 12] 
##    return x%2==0
##even=filter(evenval,range(1,11))
##print(list(even))

#...............................map() using def...............................
"""def add(n):
    return n + n
number = (1,2,3,4)
result = map(add, number)
print(set(result))"""

#........................................map() using lambda.....................................
"""number = [1,2,3,4]
result = map(lambda x : x + x, number)
print(tuple(result))"""

#....................reduce() using lambda........................................................
##from functools import reduce
#import functools
##list = [2, 4, 7, 3]
##print(reduce(lambda x, y: x + y, list))
#print(functools.reduce(lambda x, y: x + y, list))

#...................................reduce() using def............................
"""from functools import*
import functools
def add(x,y):
    return x+y
r=reduce(add,range(1,11))
r=functools.reduce(add,range(1,11))
print(r)"""



#....................................function attribute................................
"""def sum(a,b=5):
    #"Adds the two numbers"
    return a+b
sum.version="1.0"
sum.author="abcd"
sum.a=8
sum.b=10
k=sum(10,20)
print('Sum is',k)
print('The documentation string is',sum.__doc__)
print('The function name is ',sum.__name__)
print('The default values of the function are ',sum.__defaults__)
print('The code object of the function is ',sum.__code__)
print('The dictionary of the function is ',sum.__dict__)
print(sum.__module__)"""


##def rect(l,b):
##    "Computes the area of rectangle values for length and breadth are passed to the function for computation"
##    print("Area of rectangle is",l*b)
##rect(5,8)
##print(rect.__doc__)
##print(rect.__name__)
##print(rect.__defaults__)
##print(rect.__dict__)
##print(rect.__code__)
##print(rect.__module__)


#.................................recursion........................................
##def addseq(x):
##    if x==1:
##        return 1
##    else:
##        return x+addseq(x-1)
##print("The sum of first 10 sequence number is ",addseq(10))


#........................iterators...............................
x = iter(["apple", "banana", "cherry",1,2])
print(next(x))
print(next(x))
print(next(x))
print(next(x))




















