# Java 11 の実行環境を使用
FROM openjdk:11

# アプリケーションのソースコードをコンテナにコピー
COPY . /app

# アプリケーションのディレクトリに移動
WORKDIR /app

# Gradle のキャッシュを適切に扱う設定を追加
ENV GRADLE_USER_HOME=/cache
RUN mkdir /cache

# Gradle のラッパーを実行可能にする
RUN chmod +x gradlew

# アプリケーションのビルドとバックグラウンドでの実行
CMD ./gradlew bootRun
