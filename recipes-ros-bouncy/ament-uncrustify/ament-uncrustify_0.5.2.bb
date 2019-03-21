# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against style conventions using uncrustify     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "uncrustify-vendor"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_uncrustify/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09628aeb29acf7ba5ff3a9ca38ef4823"
SRC_URI[sha256sum] = "5128759a4888d4de89993777f529f41289fbe5f793085fc1b2f1f9c217f53a2a"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_uncrustify-0.5.2-0"

inherit ros
inherit setuptools3


BBCLASSEXTEND += "native"