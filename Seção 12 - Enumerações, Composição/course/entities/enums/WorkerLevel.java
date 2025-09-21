package entities.enums;

/**
 * Enumeração (Enum) que define os níveis de senioridade de um trabalhador.
 * O uso de um Enum garante a segurança de tipos, ou seja, uma variável do tipo WorkerLevel
 * só pode receber um dos valores pré-definidos (Junior, MidLevel, Senior),
 * evitando erros de digitação que ocorreriam com Strings.
 */
public enum WorkerLevel {
	Junior,
	MidLevel,
	Senior;
}