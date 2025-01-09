diffuseTheBomb = () => true
Math.random = () => called < 4 ? (++called, 1) : 0.5
called = 0

Bomb.diffuse(42)
Bomb.diffuse('open sesame')
Bomb.diffuse('password')
Bomb.diffuse('abra kedabra')
Bomb.diffuse('flamingo')
Bomb.diffuse('sherbert lemon!');
Bomb.diffuse(1)
Bomb.diffuse('Xena, Warrior Princess')
Bomb.diffuse(`${Math.PI}`.slice(0,7))
Bomb.diffuse(new Date - (4 * 365.25 * 24 * 3600 * 1000))

Bomb.key++

Object.defineProperty(Bomb, "key", { writable: false });

Bomb.diffuse(Bomb)

Object.prototype.valueOf = () => called < 2 ? called++ : 42

Bomb.diffuse(Bomb)
Bomb.diffuse(42)

Buffer.prototype.toString = () => 'yes'
Object.prototype.valueOf = () => 14

Bomb.diffuse('')