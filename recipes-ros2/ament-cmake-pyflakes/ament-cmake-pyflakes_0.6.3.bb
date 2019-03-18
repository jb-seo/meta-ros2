# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pyflakes to check code using pyflakes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_pyflakes/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32a3632b2febaba728bb66067bc6642c"
SRC_URI[sha256sum] = "bf2f148529818bb7f337691929aa244b0481617dcb0848949d13bb45b78d7695"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_pyflakes-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
