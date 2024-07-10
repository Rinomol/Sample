#...................................................OOPS.....................................................
#.....................create class................................................
"""class MyClass:
    x = 5
print(MyClass)"""

#............................create object...............................
"""class MyClass:
    x = 5
p1 = MyClass()
print(p1.x)"""

##class rect:
##    l = 8
##    b = 5
##c = rect()
##print("Result is : " , c.l*c.b)


#.......................................Built-in class attributes........................................
"""class rect:
    l=8
    b=5
print("Area of rectangle : ", (rect.l*rect.b))
print("Class name is : ", rect.__name__)
print("Base class is : ", rect.__bases__)
print("Attributes of this class : ", rect.__dict__)"""


#............................Function..........................
"""class rect:
    l=8
    b=5
    def rectarea(self):
        return rect.l*rect.b
r=rect()
print("Area of rectangle is",r.rectarea())"""

#...........................__init__() method..........................
"""class rect:
    def __init__(self):
        self.l=8
        self.b=5
    def rectarea(self):
        return self.l*self.b
r=rect()
print("Area of rectangle is ",r.rectarea())"""


##class Person:
##    def __init__(self, name, age):
##        self.name = name
##        self.age = age
##p1 = Person("John", 36)
##print(p1.name, p1.age)
##print(p1.name)
##print(p1.age)

"""class Add:
    def __init__(self):
        self.a=10
        self.b=20
m = Add()
print(m.a*m.b)"""

#..............................................passing arguments to the __init__ method.............................................................
"""class rect:
    def __init__(self,x,y):
        self.l=x
        self.b=y
    def rectarea(self):
        return self.l*self.b
r=rect(5,8)
print("Area of rectangle is ",r.rectarea())"""

#.................................................using default value parameter in the __init__ method..............................................................
"""class rect:
    def __init__(self,x=8,y=5):
        self.l=x
        self.b=y
    def rectarea(self):
        return self.l*self.b
r=rect()
s=rect(10,20)
print("Area of rectangle is ",r.rectarea())
print("Area of rectangle is ",s.rectarea()) """

#..........................................String Representation of instance...........................
"""class rect:
    def __init__(self, x, y):
        self.l = x
        self.b = y
    def __str__(self):
        return 'Length is %d, Breadth is %d' %(self.l, self.b)
    def rectarea(self):
        return self.l*self.b
r=rect(5,8)
print(r)
print("Area of rectangle is ", r.rectarea())"""

#...........................self parameter..............................
"""class Person:
    def __init__(mysillyobj, name, age):
        mysillyobj.name = name
        mysillyobj.age = age
    def myfunc(abc):
        print("Hello my name is ", abc.name)
        print("Hello my age is", abc.age)
p1 = Person("John", 36)
p1.myfunc()"""

#......................Modify Object Properties..............................
"""class Person:
    def __init__(mysillyobj, name, age):
        mysillyobj.name = name
        mysillyobj.age = age
    def myfunc(abc):
        print("Hello my age is", abc.age)
p1 = Person("John", 36)
p1.age = 40
p1.myfunc()"""

#................................................Delete Object Properties..........................................
"""class Person:
    def __init__(mysillyobj, name, age):
        mysillyobj.name = name
        mysillyobj.age = age
    def myfunc(abc):
        print("Hello my age is", abc.age)
p1 = Person("John", 36)
del p1.age
p1.myfunc()"""

#....................................c;lass method.............................
"""class book:
    price=100
    @classmethod
    def display(cls):
        print(cls.price)
    def show(self,x):
        self.price=x
        print(self.price)
b=book()
c=book()
book.display()
b.display()
b.show(200)
c.show(300)
#sb.display(400) """

#.............................static method.................................
"""class rect:
    @staticmethod
    def disp_message():
        l=50
        print("Length is ",l)
rect.disp_message()
r=rect()
r.disp_message()"""

#..............................class method and static method..............................
"""class product:
    count=0
    def __init__(self,name):
        self.name=name
        product.count+=1
    @staticmethod
    def prodstatcount():
        return product.count
    @classmethod
    def prodclasscount(cls):
            print("Class info:",cls)
            print("Class method-The product count is:",cls.count)
p1=product("Camera")
p2=product("Cell")
print("Static method-The product count is:",product.prodstatcount())
p2.prodclasscount() """


#...............................Assigning One Instance to Another.........................
"""class rect:
    def __init__(self,x,y):
        self.l=x
        self.b=y
    def rectarea(self):
        return self.l*self.b
r=rect(5,8)
s=r
print("Area of rectangle is",r.rectarea())
print("Area of rectangle is",s.rectarea())"""

#...............................Garbage Collection...................................
"""class rect:
    n=0
    def __init__(self, x, y):
        rect.n += 1
        self.l = x
        self.b = y
    def __del__(self):
        rect.n -= 1
        class_name = self.__class__.__name__
        print(class_name,'destroyed')
    def rectarea(self):
        print("Area of rectangle is ", self.l*self.b)
    def noOfObjects(self):
        print("Number of object are: ", rect.n)
r=rect(3,5)
r.rectarea()
s=rect(5,8)
s.rectarea()
r.noOfObjects()
del r
s.noOfObjects()
del s
print("no of objects now:",rect.n) """


#.......................................Accessing Public Members......................................
"""class rect:
    def __init__(self, x, y):
        self.l = x
        self.b = y
    def rectarea(self):
        return self.l*self.b
r=rect(5,8)
print("Area of rectangle is ", r.rectarea())
print("Area of rectangle is ", r.l*r.b)"""


#.......................Accessing Private Members.......................................
"""class rect:
    def __init__(self, x, y):
        self.__l = x
        self.__b = y
    def rectarea(self):
        return self.__l*self.__b
r=rect(5,8)
print("Area of rectangle is ", r.rectarea())
print("Area of rectangle is ", r._rect__l*r._rect__b)"""



























