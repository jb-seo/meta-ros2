# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to run Python tests using pytest in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_pytest/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1e145649ed3ff28b3d2a2c92fbcb01b"
SRC_URI[sha256sum] = "832290fc4d0ae3596836b333bb5f9830300315bdc673b3fc508c720b47ad9936"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_pytest-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"