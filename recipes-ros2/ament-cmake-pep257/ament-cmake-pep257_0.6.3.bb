# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pep257 to check code against the style conventions in     PEP 257."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_pep257/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f3dfe6ae7f0beadf79a6496e3184fc57"
SRC_URI[sha256sum] = "b06f713be5bc277a7d894a7843b53e21c968822656ab2d3f98614530e14231c9"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_pep257-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
