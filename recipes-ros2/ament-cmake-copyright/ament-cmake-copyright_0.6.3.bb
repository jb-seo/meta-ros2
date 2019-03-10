# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_copyright to check every source file contains copyright reference."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test ament-copyright"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_copyright/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1770e9fb14025f9bf73f8e85f4e7039e"
SRC_URI[sha256sum] = "67cbb0bb7a180776725061d28c7d2cafa3af9ba100d90fe3bd8ab7911c4de7a1"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_copyright-0.6.3-0"

inherit catkin
