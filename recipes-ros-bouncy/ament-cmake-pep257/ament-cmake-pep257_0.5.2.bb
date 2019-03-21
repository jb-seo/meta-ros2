# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pep257 to check code against the style conventions in     PEP 257."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_pep257/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a1083d2caa5ad2faf91ccfc15ae6bda"
SRC_URI[sha256sum] = "dec5439c342ed7ab97eed2abf1d2a5a927d6940fd4cc1d23381aa8aeb6e96de6"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_pep257-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"