# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to run Python tests using pytest in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_pytest/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2669cc855c50b6af378e572c8aad974"
SRC_URI[sha256sum] = "2b4bc213c53d7261775b33b2ee7dda9d9688a1e69b6fc719d538e9bec3da0b34"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_pytest-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
