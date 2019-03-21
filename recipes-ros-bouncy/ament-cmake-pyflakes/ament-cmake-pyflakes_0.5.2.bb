# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pyflakes to check code using pyflakes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_pyflakes/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "321ee8bdb840025b13ffaf0dc284f620"
SRC_URI[sha256sum] = "c163016f74ff96ef26a846f7df696ff9c2765f09289b1f6f66419fc1d6f77d85"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_pyflakes-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"