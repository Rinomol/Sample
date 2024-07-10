#..............................................................................................................................................
##n=int(input("Enter the number:"))
##b=int(input("Enter the number:"))
##c=n/b
##print(c)
##print("hello world")


#...................................................................try except....................................................................
"""try:
    a=int(input("Enter a number:"))
    if a<=6:
        b=a/(a-3)
        print("Value of b=",b)
except Exception as ex:
    print("Error Occurred",ex)
else:
    print("End of the program")"""



#..............................................else block.....................................................
'''try:
    print("hello")
except:
    print("something went wrong")
else:
    print("nothing went wrong")'''


#..................................................assert...........................................................
##a=int(input("Enter value : "))
##assert a%2==0,'not an even num'
##print("Evan number")

"""try:
    n=int(input("Enter a number:"))
    assert n%2 == 0
except:
    print("Not an even number")
else:
    reciprocal=1/n
    print("Reciprocal of number is",reciprocal)"""



#.....................................................value and zero error exception....................................................................
"""try:
    num1 = int(input("Enter First Number: "))
    num2 = int(input("Enter Second Number: "))
    result = num1 / num2
    print(result)
except ValueError as e:
    print("Invalid Input Please Input Integer...",e)
except ZeroDivisionError as e:
    print(e)
except Exception as e:
    print(e)"""


#........................................................try / finally block...................................................................
"""import  sys 
try:
    f=open("abc.txt","r")
    try:
        lines=f.read()
    finally:
        f.close()
except IOError:
    print("File abc.txt does not exist")
    sys.exit(1)
print(lines)"""


#...................................................raise an exception.................................................................
"""class myException(Exception):
    def __init__(self,quantity):
        Exception.__init__(self)
        self.quantity=quantity
    try:
        s=int(input("Enter Quantity "))
        if s <= 0:
            raise myException(s)
    except EOFError:
        print("You pressed EOF")
    except myException as ex:
        print("myException: The quantity entered is %d, It must be some positive value" %ex.quantity)
    else:
        print("No exception raised")"""


#.....................................................assert statement..................................................................
##n=int(input("Enter a positive value:"))
##assert(n>=0), 'Entered value is not a positive value'





















