#pip install nltk
from nltk.chat.util import Chat, reflections

pairs =[
	['my name is (.*)', ['Hello ! % 1']],
	['(hi|hello|hey|holla|hola)', ['Hey there !', 'Hi there !', 'Hey !']],
	['(.*) your name ?', ['My name is Groot']],
	['(.*) do you do ?', ['I provide information about Santhiram Engineering college!']],
	['(.*) Courses provided ?', ['1.CSE\n2.CSE-DS\n3.CSE-D\n4.ECE\n5.MECH\n6.EEE']],
    ['(.*) about 1',['Santhiram Engineering college offers 120 seats CSE']],
    ['(.*) about 2',['Santhiram Engineering college offers 60 seats CSE-DS']],
    ['(.*) about 3',['Santhiram Engineering college offers 60 seats CSE-D']],
    ['(.*) about 4',['Santhiram Engineering college offers 120 seats ECE']],
    ['(.*) about 5',['Santhiram Engineering college offers 60 seats MECH']],
    ['(.*) about 6',['Santhiram Engineering college offers 60 seats EEE']],
    ['(.*) college address',['NH-18,Nerawada X Roads,Nandyal, Kurnool, Andhra Pradesh 518501']]
]

chat = Chat(pairs, reflections)
chat.converse()
