# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against style conventions using     clang-format and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "clang-format"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_clang_format/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2dc934c3368c6825aa50dd676167e71"
SRC_URI[sha256sum] = "c2b1484b46985dbe5e1a20c4973e71f5d258a06abba9570474186b92d6d6a49e"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_clang_format-0.5.2-0"


inherit ros
inherit setuptools3

BBCLASSEXTEND += "native"