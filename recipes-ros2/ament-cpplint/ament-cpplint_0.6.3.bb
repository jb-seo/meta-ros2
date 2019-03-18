# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the Google style conventions using     cpplint and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cpplint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "099783773c3d21a5fdee7d2dd1b4e5c7"
SRC_URI[sha256sum] = "b01a6fe5fe3ac2e47b9e01504e191b0daaeb3019c8b217cbc8786d1255ecaeef"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cpplint-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
