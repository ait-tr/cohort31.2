import React from "react";
import ContentLoader from "react-content-loader";

const Skeleton = () => {
  return (
    <ContentLoader
      width={280}
      height={520}
      speed={2}
      backgroundColor={"#f3f3f3"}
      foregroundColor={"#ecebeb"}
      viewBox="0 0 280 520"
    >
      {/* Only SVG shapes */}
      <circle r='139' cy='139' cx='139' />
      <rect x="0" y="315" rx="10" ry="10" width="280" height="24" />
      <rect x="0" y="355" rx="10" ry="10" width="280" height="88" />
      <rect x="0" y="480" rx="10" ry="10" width="88" height="27" />
      <rect x="130" y="470" rx="30" ry="30" width="150" height="47" />
    </ContentLoader>
  );
};

export default Skeleton;
