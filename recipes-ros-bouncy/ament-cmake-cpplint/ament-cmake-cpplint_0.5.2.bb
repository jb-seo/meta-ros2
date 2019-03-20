# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_cpplint to lint C / C++ code using cpplint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_cpplint/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd192c9332a10cc63f8c54a317d56367"
SRC_URI[sha256sum] = "af9892961313405da4f1431e4b6a16775174becbffb74f749f6d8201ca5ab7a0"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_cpplint-0.5.2-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"