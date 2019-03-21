# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to perform static code analysis on C/C++ code using Cppcheck     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cppcheck"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cppcheck/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4968006107d64bdf494f6592e66096b0"
SRC_URI[sha256sum] = "152a8ef39f6a84e3500aa3da68b54b636c8b0c9e9d63babf684fee2ec7ae752f"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cppcheck-0.5.2-0"

inherit ros
inherit setuptools3


BBCLASSEXTEND += "native"