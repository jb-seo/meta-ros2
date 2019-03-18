# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pep8 to check code against the style conventions in     PEP 8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_pep8/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b70e2567dbaa8c3eb306d943c30d256"
SRC_URI[sha256sum] = "ace6f1c42c6b5221818d5ab88d82524ffd322ac66505f62ed5a71815662cd476"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_pep8-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
