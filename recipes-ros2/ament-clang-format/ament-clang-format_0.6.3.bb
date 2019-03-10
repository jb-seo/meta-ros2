# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against style conventions using     clang-format and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "clang-format"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_clang_format/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf9cc7316fa83b3c76b2c58ac1fa330b"
SRC_URI[sha256sum] = "80da12ba4469b7a179ee674c070bc4ebf71fa27390b6866b824a0dcab0d23dd5"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_clang_format-0.6.3-0"

inherit catkin
