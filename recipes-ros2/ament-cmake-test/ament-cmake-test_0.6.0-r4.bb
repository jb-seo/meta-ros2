# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_test/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "71a03db8f21042512d78b516f409c86f"
SRC_URI[sha256sum] = "2b6fa4971761c307bd3fee88cac96a03c73eeecf093378adf64d6d8b3d68e989"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_test-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
