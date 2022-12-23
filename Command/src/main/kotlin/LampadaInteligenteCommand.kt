import Command as Command

class LampadaInteligenteCommand : Command {
    private var lampadaInteligente: LampadaInteligente

    constructor(lampada: LampadaInteligente) {
        this.lampadaInteligente = lampada
    }

    override fun executar() {
        this.lampadaInteligente.ligar()
        println("A ${this.lampadaInteligente.getNome()} foi ligada!")
    }

    override fun desfazer() {
        this.lampadaInteligente.desligar()
        println("A ${this.lampadaInteligente.getNome()} foi desligada!")
    }
}