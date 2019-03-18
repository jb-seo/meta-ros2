# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pclint to perform static code analysis on C/C++     code using PCLint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_pclint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "570c2632836638631d857293d56f59ed"
SRC_URI[sha256sum] = "2291a590092ce897a1e6c3686921ddd421c596c79f7a12c2704e6fc490b56681"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_pclint-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
