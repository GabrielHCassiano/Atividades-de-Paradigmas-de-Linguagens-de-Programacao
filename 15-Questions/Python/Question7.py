class Escola:
    def __init__(self):
        self.professor = []

class Professor:
    pass

escola1 = Escola()
escola2 = Escola()

professor1 = Professor()
professor2 = Professor()

escola1.professor.append(professor1)
escola1.professor.append(professor2)
escola2.professor.append(professor1)
escola2.professor.append(professor2)

