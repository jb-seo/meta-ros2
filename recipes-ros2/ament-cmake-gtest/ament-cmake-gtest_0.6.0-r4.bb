# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add gtest-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_gtest/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a00fb11aa7f7802f2dc53eea58055879"
SRC_URI[sha256sum] = "0dbfcb37ddcde4fd792758450ee2cbad32bef5c247754ff4ba6f85f170a9a1a6"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_gtest-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
