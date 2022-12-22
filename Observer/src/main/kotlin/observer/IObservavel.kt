package observer

interface IObservavel {
    var observadores: MutableList<IObservador>
    fun adicionarObservadores(observador: IObservador)
    fun removerObservador(observador: IObservador)
    fun notificar(noticia: String)
}