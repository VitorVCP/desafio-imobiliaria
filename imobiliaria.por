//Uma empresa de imobiliária vende terrenos de formato retângular e triângular, deve descrever seu formato, sua área e seu valor.
programa {
  inclua biblioteca Matematica
  funcao inicio() {
    real numero, compR, largR, frente, fundo, lateral, area, base, altura, semi, valor = 98.56 ,arredondar, valorq, valort
    escreva ("Qual será o formato do terreno, retângular ou triângular? \ndigite:\n(1): retângulo.\n(2): triângulo.\n")
    leia (numero)

escolha (numero)
{
caso 1:
escreva ("Insira o valor do comprimento, em metros:\nComprimento: ")
leia (compR)
escreva ("\nInsira o valor da largura:\nLargura: ")
leia (largR)
escreva ("A área total do terreno será: ", (compR * largR), " metros.\n")
real a = valor * compR * largR
valorq = Matematica.arredondar( a , 2) 
escreva ("E seu valor será de: ", valorq, " reais")

pare

caso 2:
escreva ("Insira o diâmetro da frente, em metros:\nfrente: ")
leia (frente)
escreva ("\nInsira o diâmetro do fundo:\nfundo: ")
leia (fundo)
escreva ("\nInsira o diâmetro da lateral:\nlateral: ")
leia (lateral)

se (frente == fundo e fundo == lateral) {
 area = (frente * frente * 1.732) /4
 escreva ("\nSeu triângulo é equilátero. \n")
}

senao se (frente == fundo ou frente == lateral ou fundo == lateral) {
  escreva ("\n Seu triângulo é isósceles. \n")
  se (frente == fundo) {
  base = lateral
  altura = Matematica.potencia(frente * frente - (base/2) * (base/2), 0.5)
}
senao se (frente == lateral) {
  base = fundo
  altura = Matematica.potencia(frente * frente - (base / 2) * (base / 2), 0.5)
}
senao {
  base = frente
  altura = Matematica.potencia(fundo * fundo - (base/2) * (base / 2), 0.5)
}
area = (base * altura) / 2

}
senao {
  escreva ("\n Seu triângulo é escaleno. \n")
semi = (frente + fundo + lateral) / 2
area = Matematica.potencia(semi * (semi - frente) * (semi - fundo) * (semi - lateral), 0.5)
}
escreva("A área do triângulo é: ", area, " metros.\n")
real b = area * valor
valort = Matematica.arredondar( b , 2) 
escreva ("E seu valor será de: ", valort, "R$.")
}
}
  }
