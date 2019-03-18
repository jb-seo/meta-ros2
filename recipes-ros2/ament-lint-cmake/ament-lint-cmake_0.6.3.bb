# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to lint CMake code using cmakelint and generate xUnit test     result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_lint_cmake/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e3b7da8e4df8c970f312ccb07ad6dab"
SRC_URI[sha256sum] = "99720e3cf0bd8a57326fba4f98757a5ea5885f83dde859a1bd43ca01ea8e530e"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_lint_cmake-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
