def buildImage(String contextDir='.', String imageRef) {
  if (!imageRef) { error 'dockerUtils.buildImage: imageRef is required' }
  sh "docker build -t ${imageRef} ${contextDir}"
  echo "Built image ${imageRef}"
}
def pushImage(String imageRef) {
  if (!imageRef) { error 'dockerUtils.pushImage: imageRef is required' }
  sh "docker push ${imageRef}"
  echo "Pushed image ${imageRef}"
}
