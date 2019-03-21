# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_uncrustify to check code against styleconventions     using uncrustify."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_uncrustify/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7802fb129c86fd7993b068981fd7e855"
SRC_URI[sha256sum] = "60376e3af1506f4e5771d893a56996d6a3b0ac4f2baf51d830c464e36d7fd52c"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_uncrustify-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"