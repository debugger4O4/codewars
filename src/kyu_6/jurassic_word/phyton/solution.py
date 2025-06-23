// https://www.codewars.com/kata/55709dc15ebd283cc9000007/train/python

class JurassicWord(object):

    @classmethod
    def lunch_time(self, scene):
        dino_map = {'vvvvv': 'A velociraptor', 'uuuuu': 'A brachiosaurus',
                     'VvvvV': 'A T-Rex', 'uuVuu': 'A triceratops'}
        food_map = {'_CC}>': 'a dead dino.', 'iiiiii': 'flowers.', '||||||': 'leaves.'}

        dino = dino_map.get(scene[-8:-3], 'Something')
        food = food_map.get(scene[:-8] + scene[-3:], 'something.')
        if (food == 'a dead dino.' and dino not in ('A T-Rex', 'A velociraptor')) or\
        (food == 'leaves.' and dino != 'A brachiosaurus') or\
        (food in ('leaves.', 'flowers.') and dino not in ('A brachiosaurus', 'A triceratops')):
            dino = 'Something'

        return f'{dino} is eating {food}'