rootProject.name = "ironman-multi-module"

include(
    "module-body",
    "module-core",
    "module-left-arm-v1",
    "module-left-arm-v1:left-arm",
    "module-left-arm-v1:left-hand",
    "module-left-arm-v1:left-shoulder",
    "module-left-arm-v2",
    "module-left-arm-v2:left-arm",
    "module-left-arm-v2:left-hand",
    "module-left-arm-v2:left-shoulder",
    "module-right-arm-v1",
    "module-right-arm-v1:right-arm",
    "module-right-arm-v1:right-shoulder",
    "module-right-arm-v1:right-hand",
)

//// list를 활용한 방식
//val moduleBody = listOf(
//    "module-body"
//)
//
//val moduleCore = listOf(
//    "module-core"
//)
//
//val moduleLeftArmsV1 = listOf(
//    "module-left-arm-v1",
//    "module-left-arm-v1:left-shoulder",
//    "module-left-arm-v1:left-arm",
//    "module-left-arm-v1:left-hand",
//)
//
//val moduleRightArmsV1 = listOf(
//    "module-right-arm-v1",
//    "module-left-arm-v1:left-shoulder",
//    "module-left-arm-v1:left-arm",
//    "module-left-arm-v1:left-hand",
//)
//
//val modules = moduleBody+ moduleCore + moduleLeftArmsV1 + moduleRightArmsV1
//
//modules.forEach { include(it) }

// flatmap을 활용한 방식
//val groupedModules = mapOf(
//    "body" to listOf("module-body"),
//    "core" to listOf("module-core"),
//    "left-arm-v1" to listOf(
//        "module-left-arm-v1",
//        "module-left-arm-v1:left-shoulder",
//        "module-left-arm-v1:left-arm",
//        "module-left-arm-v1:left-hand"
//    ),
//    "right-arm" to listOf(
//        "module-right-arm-v1",
//        "module-left-arm-v1:left-shoulder",
//        "module-left-arm-v1:left-arm",
//        "module-left-arm-v1:left-hand"
//    )
//)
//
//groupedModules.values.flatten().forEach { include(it) }


//// 특정 모듈을 제외할 리스트
//val excludedModules = setOf(
//    "module-left-arm-v2"
//)
//
//// 파일 경로 접근 (하위 서브모듈 탐색 코딩 필요)
//rootDir.listFiles()
//    ?.filter {
//        it.name.startsWith("module-") &&
//                it.isDirectory && ! it.isHidden }
//    ?.map { it.name }
//    ?.filterNot{
//        it in excludedModules
//    }
//    ?.forEach { include(it)}
