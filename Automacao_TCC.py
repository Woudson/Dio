# Criar um programa de automação de serviços
# Interface simples com 3 seções
# ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- #

from googletrans import Translator

# Criar uma instância do tradutor
translator = Translator()

# Texto a ser traduzido
text = input("Digite o texto que você deseja traduzir: ")

# Escolher o idioma de destino (por exemplo, inglês - 'en')
target_language = input("Digite o código do idioma de destino (por exemplo, 'en' para inglês): ")

# Fazer a tradução
translation = translator.translate(text, dest=target_language)

# Exibir a tradução
print(f"Texto traduzido: {translation.text}")
