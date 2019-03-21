# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pep8 to check code against the style conventions in     PEP 8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_pep8/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "17dc601741c2e5ce4c205b0ed9cc5aec"
SRC_URI[sha256sum] = "b414fc850b149f8b1c9d1e234785e04de05ebd472068855844b6775c3b548f13"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_pep8-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"