from tkinter import *
from tkinter import messagebox
from tkinter import ttk

w=Tk()
w.geometry("500x500")
w.title("FORM")
w.config(bg="skyblue")

l=Label(w, text="Registration Form", font=("Times", 22,"bold"),
        fg="red", relief=RAISED, bg="white").pack(side=TOP)

l1=Label(w, text="Name", font=("times",14), relief=RAISED).place(x=50,y=50)
e1=Entry(w, bd=2, cursor="plus cursor").place(x=130,y=55)

l2=Label(w, text="Email", font=("times", 14,"bold")).place(x=50,y=100)

w.mainloop()
