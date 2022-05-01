#pip install tk
from tkinter import *
root=Tk()
def send():
    send="You:"+e.get()
    txt.insert(END,"\n"+send)
    if((e.get().lower()== "hello") or (e.get().lower()=='hai') or (e.get().lower()=='hi') or (e.get().lower()=='hey')):
        txt.insert(END,"\n"+"SREC:Hello")
    elif(e.get().lower()=="how are you?"):
        txt.insert(END,"\n"+"SREC:I am a computer dude I am always good.\nHow are you Student?")
    elif((e.get()=="fine")or(e.get()=="nice")or(e.get()=='cool')):
        txt.insert(END,"\n"+"SREC:Thats'good.")

    elif((e.get().lower()=="tell me about your college information") or (e.get()=="college information")):
        txt.insert(END,'\n'+"SREC: Our College provides you delifferent types of Engineering courses \n1.CSE\n2.CSE-DS\n3.CSE-D\n4.ECE\n5.MECH\n6.EEE")
    
    elif((e.get().lower()=="cse") or (e.get()=="1")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 120 seats in CSE branch")
    elif((e.get().lower()=="cse-ds") or (e.get()=="2")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 60 seats in CSE-DS branch")
    elif((e.get().lower()=="cse-d") or (e.get()=="3")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 60 seats in CSE-D branch")
    elif((e.get().lower()=="ece") or (e.get()=="4")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 120 seats in ECE branch")
    elif((e.get().lower()=="mech") or (e.get()=="5")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 60 seats in MECH branch")
    elif((e.get().lower()=="eee") or (e.get()=="6")):
        txt.insert(END,'\n'+"SREC: Santhiram Engineering college offers 60 seats in EEE branch")
    e.delete(0,END)
    
txt=Text(root)
txt.grid(row=0,column=0,columnspan=2)
e=Entry(root,width=100)
send=Button(root,text="Send",command=send).grid(row=1,column=1)
e.grid(row=1,column=0)
root.title("SREC CHATBOT")
txt.insert(END,"SREC:Welcome to Santhiram Engineering College.\n\n")
txt.insert(END,"----------------------------------------------")
root.mainloop()