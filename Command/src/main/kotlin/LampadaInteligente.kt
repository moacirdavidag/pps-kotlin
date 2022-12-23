class LampadaInteligente {
    private var isLigada: Boolean = false
    private var nome: String

    constructor(nome: String) {
        this.nome = nome
    }

    fun estadoDaLampada() : String {
        if(isLigada) {
            return "Ligada"
        } else {
            return "Desligada"
        }
    }

    fun ligar(): Boolean {
        if(!isLigada) {
            this.isLigada = true
        }
        println("A ${this.nome} foi ligada!")
        return isLigada
    }

    fun desligar(): Boolean {
        if(!!isLigada) {
            this.isLigada = false
        }
        println("A ${this.nome} foi desligada!")
        return isLigada
    }
}