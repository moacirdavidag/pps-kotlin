import observer.IObservador

class AssinanteObservador : IObservador {

    var nome: String = ""
    override fun atualizar(algo: Any) {
        println("Olá, ${this.nome}! Uma nova notícia: ${algo}")
    }
}