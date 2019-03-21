# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around assimp, providing nothing but a dependency on assimp, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of assimp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "assimp"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_assimp_vendor/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c86b77a2f23ee3c56386c4f423ae8d6"
SRC_URI[sha256sum] = "b66b0dc8ce75f7277869c4edabacd008b467a6e819f4b21cc154e86152011af6"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_assimp_vendor-4.0.2-0"

inherit ros
inherit ament


