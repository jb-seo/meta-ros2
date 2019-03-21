# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_copyright to check every source file contains copyright reference."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test ament-copyright"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_copyright/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a49d6b82126a209df54b8e2de340ff49"
SRC_URI[sha256sum] = "847e2f589e67871a8ad144d45e27ac54f9c97b72737945e517ca5a23efb4ffba"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_copyright-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"