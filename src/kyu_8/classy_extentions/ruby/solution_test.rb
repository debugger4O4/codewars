describe 'Fixed Tests' do
  it 'Fixed Test Cases' do
    cat = Cat.new('Mr Whiskers')
    expect(cat.speak).to eq 'Mr Whiskers meows.'
    cat = Cat.new('Lamp')
    expect(cat.speak).to eq 'Lamp meows.'
    cat = Cat.new('$$Money Bags$$')
    expect(cat.speak).to eq '$$Money Bags$$ meows.'
  end
end