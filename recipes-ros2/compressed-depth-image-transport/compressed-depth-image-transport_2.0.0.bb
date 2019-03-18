# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_depth_image_transport provides a plugin to image_transport for transparently sending     depth images (raw, floating-point) using PNG compression."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cv-bridge image-transport"
SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/crystal/compressed_depth_image_transport/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed04382c79d33920a5bd440d19e20006"
SRC_URI[sha256sum] = "f4f1b34f97b7804c465ba8e3521c4040dad59873354b378db59b025aa5e54a1c"
S = "${WORKDIR}/image_transport_plugins-release-release-crystal-compressed_depth_image_transport-2.0.0-0"

inherit ament
